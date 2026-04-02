# Activity Tracker (General CLI)

A lightweight Java command-line app for loading activity records from a text file and running quick activity-time queries.  
It is designed for learners and developers who want a simple, file-based activity tracker with query commands.

![Java](https://img.shields.io/badge/Java-8%2B-orange)
![Build](https://img.shields.io/badge/build-make%20%2F%20javac-blue)
![Platform](https://img.shields.io/badge/platform-CLI-lightgrey)
![License](https://img.shields.io/badge/license-Not%20specified-lightgrey)

[Install](#-getting-started) • [Usage](#️-usage) • [Contributing](#-contributing)

## Table of Contents

- [📌 About](#-about)
- [✨ Features](#-features)
- [🧱 Tech Stack](#-tech-stack)
- [📂 Project Structure](#-project-structure)
- [🚀 Getting Started](#-getting-started)
- [🛠️ Usage](#️-usage)
- [🧪 Testing](#-testing)
- [⚙️ Configuration](#️-configuration)
- [🗺️ Roadmap](#️-roadmap)
- [🤝 Contributing](#-contributing)
- [🙏 Credits / Attribution](#-credits--attribution)
- [📄 License](#-license)
- [🙌 Support](#-support)

## 📌 About

This project reads activity entries from a plain-text file, converts each line into a typed activity object, and supports interactive CLI queries.

**Who it is for**
- Java beginners practicing OOP and CLI workflows
- Developers who want a small, no-framework activity query tool

**Core use cases**
- Calculate total tracked activity time
- Filter activities by type
- Filter activities between two dates

## ✨ Features

- Interactive CLI entry (`ActivityTracker` → `ApplicationManager`)
- File-based activity ingestion (one activity per line)
- Supported activity types:
  - `WALKING`
  - `RUNNING`
  - `CYCLING`
  - `SWIMMING`
- Query commands:
  - `TOTAL-TIME`
  - `ACTIVITY <type>`
  - `BETWEEN <start-date> <end-date>`
- Built-in formatting for activity details (duration, distance/elevation or laps/lap length)

## 🧱 Tech Stack

- **Language:** Java
- **Runtime:** JDK 8+ (uses `Duration`/`LocalDate`)
- **Build tools:** `make`, `javac`, `java`
- **Data format:** Plain text file (`data.txt` example)

## 📂 Project Structure

```text
.
├── ActivityTracker.java        # Main entry point
├── ApplicationManager.java     # App flow: load file, parse, query loop
├── InputManager.java           # User prompts and CLI input
├── QueryProcessor.java         # Parses and dispatches query commands
├── Query.java                  # Base query class
├── TotalTimeQuery.java         # TOTAL-TIME query
├── BetweenTimeQuery.java       # BETWEEN query
├── TypeQuery.java              # ACTIVITY query
├── ActivityIdentifier.java     # Maps text lines to activity objects
├── ActivityInterface.java      # Activity contract
├── Activity.java               # Base activity model
├── LandActivity.java           # Base for walking/running/cycling
├── OfflandActivity.java        # Base for swimming
├── Walking.java
├── Running.java
├── Cycling.java
├── Swimming.java
├── GeneralActivity.java        # Temporary parsed-field holder
├── data.txt                    # Sample activity input file
└── makefile                    # Build and run commands
```

| File/Module | Purpose |
|---|---|
| `ActivityTracker.java` | Starts the application. |
| `ApplicationManager.java` | Coordinates file loading, parsing, query setup, and command loop. |
| `ActivityIdentifier.java` | Parses each data line and instantiates the right activity class. |
| `QueryProcessor.java` + `*Query.java` | Implements query parsing and execution logic. |
| `data.txt` | Example dataset for quick local usage. |

## 🚀 Getting Started

### Prerequisites

- JDK 8 or newer
- `make` (optional, but included in repo workflow)

### Installation

```bash
git clone https://github.com/sultanshahdev/activity-tracker-general-cli.git
cd activity-tracker-general-cli
```

### Environment setup

No environment variables are required.

### Run locally

> **Assumption:** `ActivityTracker` is the intended runnable CLI entry point.  
> Note: `make compile` runs `javac *.java`, which includes files currently present in the repository that contain incomplete/invalid Java code (for example, `ActivityQuery.java` and `Swiming.java`). Use the command below to compile the confirmed runnable CLI sources.

```bash
javac ActivityTracker.java ApplicationManager.java InputManager.java QueryProcessor.java Query.java QueryInterface.java TotalTimeQuery.java BetweenTimeQuery.java TypeQuery.java ActivityIdentifier.java GeneralActivity.java ActivityInterface.java Activity.java LandActivity.java OfflandActivity.java Cycling.java Running.java Walking.java Swimming.java
java ActivityTracker
```

When prompted:
1. Enter an input file path (e.g., `data.txt`)
2. Enter query commands
3. Type `EXIT` to quit

## 🛠️ Usage

### Data file format

Each line is space-delimited. Examples from `data.txt`:

```text
WALKING store Selkirk 2022-07-01 PT20M 2 1
SWIMMING OpenSwim PanAm 2023-01-10 PT30M 10 50
CYCLING PerimeterCircuit Winnipeg 2022-07-23 PT2H45M 80 50
RUNNING Track SilverHeights 2022-08-10 PT30M 5 0
```

### Query commands

```text
TOTAL-TIME
ACTIVITY Running
ACTIVITY Walking
BETWEEN 2022-07-01 2022-12-31
EXIT
```

### Typical workflow

1. Start app
2. Provide file path
3. Run one or more queries
4. Exit with `EXIT`

## 🧪 Testing

No automated test suite is currently available in this repository.

Basic smoke check:

```bash
printf 'data.txt\nTOTAL-TIME\nEXIT\n' | java ActivityTracker
```

## ⚙️ Configuration

- No config files or environment variables are required.
- Input data source is provided interactively as a file path.
- Date input uses `YYYY-MM-DD`.
- Duration input in data file uses ISO-8601 duration format (e.g., `PT30M`, `PT2H45M`).

## 🗺️ Roadmap

- [ ] Add automated unit tests for parsers and query logic
- [ ] Add validation/error handling for malformed query input
- [ ] Add support for inclusive date-range queries
- [ ] Add CSV/JSON import options
- [ ] Add CI workflow for compile/test checks
- [ ] Add packaged releases (e.g., runnable JAR)

## 🤝 Contributing

Contributions are welcome.

Suggested flow:
1. Fork the repository
2. Create a feature branch (`feature/short-description`)
3. Make focused changes
4. Verify compile/run locally
5. Open a pull request with:
   - clear problem statement
   - summary of changes
   - reproduction/validation steps

> **Assumption:** No repository-specific branch/commit convention file was found, so standard GitHub PR practices are recommended.

## 🙏 Credits / Attribution

No explicit third-party attribution notices or source-header copyright notices were found in the current repository files.

## 📄 License

License is **not specified** in the repository (no `LICENSE` file detected).

If you maintain this repository, add a `LICENSE` file to define usage and contribution terms clearly.

## 🙌 Support

- ⭐ Star this repository if you find it useful
- 🍴 Fork it to extend functionality
- 🐛 Open an issue for bugs or suggestions
- 💬 Use pull requests for improvements
