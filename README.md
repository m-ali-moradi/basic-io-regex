# basic-io-regex

# Energy Management System

This project is part of Home Assignment 1, focusing on building an Energy Management System with logging functionality for charging stations, energy sources, and the overall system.

## Role Distribution
- **Dörthe**: 
  - Log creation (charging stations, energy sources, system-wide).
  - Log searching functionality (by equipment name or date).
  - File handling and regular expressions.
  
## How to Run the Project
1. Clone the repository to your local machine.
    ```bash
    git clone https://github.com/yourusername/HA1-EnergyManagementSystem.git
    ```
2. Navigate to the project folder.
    ```bash
    cd HA1-EnergyManagementSystem
    ```
3. Compile and run the program using Java. Example command (adjust for your environment):
    ```bash
    javac src/IORegex/LogFileCreator.java
    java src/IORegex/LogFileCreator
    ```
4. You can search for log files using the `LogFileSearcher` class by specifying a directory and query.

---

## Log File Generation
Log files are created daily based on charging stations and energy sources. These files are stored in the `logs/` directory (or another specified directory).

## Log Searching
You can search for log files using:
- Equipment name (e.g., "Station1")
- Date in the format `yyyyMMdd` (e.g., "20241007")

