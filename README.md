# Institute Firewall System

## Project Title

**Firewall Simulator and Security Assessment System for Educational Institute**

---

## Project Description

This project is a Java application that simulates a firewall for an educational institute network.

The system manages virtual network devices, applies firewall rules, simulates network traffic, evaluates the security level, calculates a security score, determines the risk level, stores simulation results, and generates security reports.

---

# Objectives

- Simulate a firewall environment.
- Add and manage virtual network devices.
- Apply firewall rules using Allow and Deny actions.
- Simulate and analyze network traffic.
- Calculate Security Score.
- Display Risk Level.
- Generate security assessment reports.
- Store simulation results.

---

# Project Scope

The system simulates a small educational institute network containing:

- Administration devices.
- Student devices.
- Guest devices.
- Internal web server.
- Network printer.
- Router and switch.

The system focuses on monitoring virtual traffic, applying firewall rules, evaluating security conditions, and generating security recommendations.

---

# System Features

## Firewall Simulation

The system includes:

- Firewall rule management.
- Packet checking.
- Allow and Deny traffic decisions.
- Traffic simulation between virtual devices.

---

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

---

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

---

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

---

# System Architecture

The system consists of the following components:

```text
                 User
                   |
                   |
          Application Logic
                   |
     --------------------------------
     |              |               |
 Firewall Engine  Security     Report Generator
                  Assessment
                   |
                   |
       Virtual Network Devices
                   |
                   |
             Data Storage