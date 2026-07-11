# System Architecture

## Overview

The system is designed as a Java desktop application that simulates a firewall for a small educational institute. It consists of several components that work together to monitor network traffic, apply firewall rules, evaluate network security, and generate security reports.

## System Components

### 1. User
Represents the system user such as an administrator or student.

### 2. Device
Represents network devices such as:
- Administration PC
- Student PC
- Guest PC
- Internal Server
- Printer

### 3. Firewall
Checks all incoming and outgoing connections and applies firewall rules.

### 4. Firewall Rule
Defines whether a connection is allowed or denied based on the source and destination devices.

### 5. Traffic
Represents network communication between devices.

### 6. Security Assessment
Calculates the security score and determines the risk level.

### 7. Report Generator
Generates the final security report with recommendations.

### 8. Database
Stores users, devices, firewall rules, traffic logs, and security assessment results.

## System Flow

User
↓
Login
↓
Network Device
↓
Firewall
↓
Traffic Analysis
↓
Security Assessment
↓
Security Report
