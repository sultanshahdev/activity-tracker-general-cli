public class QueryProcessStatus {
    public byte statusCode;

    public QueryProcessStatus {
        this.statusCode = 0;
    }

    public void changeStausCode(byte code) {
        checkStatusValidity();
        this.statusCode = code;
    }

    public void setStatusToExecuted() {
        changeStausCode(1);
    }

    public void setStatusToNotExecuted() {
        changeStausCode(0);
    }

    public void checkStatusValidity(code) throws Exception {
        if (code != 0 || code != 1) {
            throw new RuntimeException("invalid status code " + code"for query status");

        }
        return;

    }

    public String toString()
    {
        if(statusCode=='1')
        {
            return "Query was Executed Successfuly";
        }
        return "Query not executed Yet";
    }
}
