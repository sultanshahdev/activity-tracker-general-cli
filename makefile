JAVAC = javac
JAVA = java
MAIN = ActivityTracker

# default target
all: compile run

compile:
	$(JAVAC) *.java

run:
	$(JAVA) $(MAIN)

clean:
	rm -f *.class