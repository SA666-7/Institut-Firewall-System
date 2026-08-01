# Institute Firewall System

## Project Title
Firewall Simulator and Security Assessment System for Educational Institute

## Project Description
This project is a Java application that simulates a firewall for an educational institute network.

The system manages virtual network devices, applies firewall rules, simulates network traffic, evaluates the security level, calculates a security score, determines the risk level, stores simulation results, and generates security reports.

## Objectives
- Simulate a firewall environment.
- Add and manage virtual network devices.
- Apply firewall rules using Allow and Deny actions.
- Simulate and analyze network traffic.
- Calculate Security Score.
- Display Risk Level.
- Generate security assessment reports.
- Store simulation results.

## Project Scope
The system simulates a small educational institute network containing:

- Administration devices.
- Student devices.
- Guest devices.
- Internal web server.
- Network printer.
- Router and switch.

The system focuses on monitoring virtual traffic, applying firewall rules, evaluating security conditions, and generating security recommendations.

# System Features

## Firewall Simulation

The system includes:

- Firewall rule management.
- Packet checking.
- Allow and Deny traffic decisions.
- Traffic simulation between virtual devices.

## Security Assessment

The system evaluates network security based on several criteria:

- Enable Default Deny.
- Disable Telnet.
- Guest Network Isolation.
- Firewall Review.
- Suspicious Traffic Detection.
- Internal Server Protection.
- Printer Access Restriction.
- Internet Access Control.
- Strong Passwords.
- Event Logging.

The system calculates:

- Security Score.
- Risk Level.
- Security Recommendations.

# Data Storage

The system stores generated results using file-based storage.

Stored information includes:

## Network Devices

- Device Name.
- Device Type.
- IP Address.

## Firewall Rules

- Source IP.
- Destination IP.
- Port.
- Protocol.
- Action (Allow / Deny).

## Traffic Logs

- Source IP.
- Destination IP.
- Port.
- Protocol.
- Result.

## Security Assessment Results

- Security Score.
- Risk Level.
- Recommendations.

# HTML Security Report

The system generates an organized HTML security report containing:

## Network Information Table

Includes:

- Number of Devices.
- Number of Firewall Rules.

## Firewall Simulation Results Table

Includes:

- Source IP.
- Destination IP.
- Port.
- Protocol.
- Result.

## Security Assessment Section

Displays:

- Security Score.
- Risk Level.

## Security Recommendations Section

Displays recommended security improvements.

# System Architecture

The system consists of the following components:

User  
↓  
Application Logic  
↓  
Firewall Engine | Security Assessment | Report Generator  
↓  
Virtual Network Devices  
↓  
Data Storage


# Technologies

- Java
- HTML Report Generation
- File-Based Data Storage
- GitHub


# Week 3 Implementation

During the third week, the following features were completed:

## 1. Data Storage

- Added storage for network devices information.
- Added storage for firewall rules.
- Added storage for Traffic Logs generated during simulation.
- Added storage for Security Assessment results.

## 2. HTML Report Enhancement

- Improved HTML report design and organization.
- Added tables to display system information.
- Added Firewall Simulation Results table containing:

  - Source IP.
  - Destination IP.
  - Port.
  - Protocol.
  - Result.

## 3. Security Assessment Report

- Added Security Score display.
- Added Risk Level display.
- Added Security Recommendations section.

## 4. Generated Files

The system generates:

- `SecurityReport.html`  
  Used to display the security assessment report.

- `SecurityResults.txt`  
  Used to store devices, firewall rules, traffic logs, and security assessment results.


# Project Timeline

The project is developed within 4 weeks:

- Week 1: Analysis and system design.
- Week 2: Firewall simulation and network implementation.
- Week 3: Security assessment, data storage, and report generation.
- Week 4: Testing and final documentation.


# Expected Results

- A working Java firewall simulator.
- Virtual network traffic simulation.
- Firewall rule processing.
- Security score calculation.
- Automated HTML security report generation.
- Saved security assessment results.


# Project Status

Completed:

- Firewall simulation.
- Security assessment.
- HTML report generation.
- Data storage for simulation results.