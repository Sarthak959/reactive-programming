CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE Students (
    id CHAR(36) PRIMARY KEY DEFAULT gen_random_uuid(),
    student_name VARCHAR(255),
    total_marks INT 
    );
