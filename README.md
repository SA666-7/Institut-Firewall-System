# Institute Firewall System

## Project Title
Firewall Simulator and Security Assessment System for Educational Institute

## Project Description
This project is a Java application that simulates a firewall for an educational institute. It manages virtual network devices, applies firewall rules, simulates network traffic, evaluates the security level, and generates a security report.

## Objectives
- Simulate a firewall.
- Add virtual network devices.
- Apply firewall rules.
- Analyze network traffic.
- Calculate a Security Score.
- Display the Risk Level.
- Generate a final security report.

## Project Scope
The system simulates a small educational institute network containing:
- Administration device.
- Student devices.
- Guest devices.
- Internal server.
- Printer.
- External Internet connection.

The system focuses on monitoring virtual traffic, applying firewall rules, and assessing the security level of the network.

## Database Design
The project uses SQLite Database to store system information.

### Tables:

### Devices Table
Stores information about virtual network devices:
- Device ID
- Device Name
- Device Type
- IP Address
- Status

### Firewall Rules Table
Stores firewall control rules:
- Rule ID
- Source Device
- Destination Device
- Action (Allow / Deny)
- Protocol

### Traffic Log Table
Stores network traffic records:
- Traffic ID
- Source
- Destination
- Time
- Result

### Security Assessment Table
Stores security evaluation results:
- Assessment ID
- Security Score
- Risk Level
- Recommendations
- Date

## System Architecture
The system consists of the following components:

User Interface
        |
Application Logic
        |
-------------------------
|          |            |
Firewall  Security   Report
Engine    Assessment Generator
        |
SQLite Database
        |
Virtual Network Devices

## Technologies
- Java
- SQLite Database
- GitHub

## Project Timeline
The project will be developed within 4 weeks:
- Week 1: Analysis and system design.
- Week 2: Firewall simulation and network implementation.
- Week 3: Security assessment and report generation.
- Week 4: Testing and documentation.

## Expected Results
- A working Java firewall simulator.
- Virtual network traffic simulation.
- Security score calculation.
- Automated security report generation.

## Project Status
In Progress
