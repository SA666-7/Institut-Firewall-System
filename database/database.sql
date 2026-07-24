CREATE TABLE Devices (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    deviceName TEXT,
    deviceType TEXT,
    ipAddress TEXT
);

CREATE TABLE FirewallRules (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    ruleName TEXT,
    status TEXT
);

CREATE TABLE TrafficLogs (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    sourceDevice TEXT,
    destinationDevice TEXT,
    trafficStatus TEXT
);

CREATE TABLE SecurityAssessment (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    securityScore INTEGER,
    riskLevel TEXT
);
