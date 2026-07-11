-- Create Users Table
CREATE TABLE Users (
    user_id INTEGER PRIMARY KEY AUTOINCREMENT,
    username TEXT NOT NULL,
    password TEXT NOT NULL,
    role TEXT NOT NULL
);

-- Create Devices Table
CREATE TABLE Devices (
    device_id INTEGER PRIMARY KEY AUTOINCREMENT,
    device_name TEXT NOT NULL,
    device_type TEXT NOT NULL,
    ip_address TEXT NOT NULL,
    status TEXT NOT NULL
);

-- Create Firewall Rules Table
CREATE TABLE Firewall_Rules (
    rule_id INTEGER PRIMARY KEY AUTOINCREMENT,
    source_device TEXT NOT NULL,
    destination_device TEXT NOT NULL,
    action TEXT NOT NULL,
    protocol TEXT NOT NULL
);

-- Create Traffic Log Table
CREATE TABLE Traffic_Log (
    traffic_id INTEGER PRIMARY KEY AUTOINCREMENT,
    source TEXT NOT NULL,
    destination TEXT NOT NULL,
    result TEXT NOT NULL,
    timestamp TEXT NOT NULL
);

-- Create Security Assessment Table
CREATE TABLE Security_Assessment (
    assessment_id INTEGER PRIMARY KEY AUTOINCREMENT,
    security_score INTEGER NOT NULL,
    risk_level TEXT NOT NULL,
    recommendations TEXT NOT NULL,
    assessment_date TEXT NOT NULL
);
