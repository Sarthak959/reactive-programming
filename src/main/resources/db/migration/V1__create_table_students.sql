CREATE TABLE students (
    id VARCHAR(80) PRIMARY KEY,
    student_name VARCHAR(255) NOT NULL,
    total_marks INT NOT NULL
);

INSERT INTO students (id, student_name, total_marks)
VALUES ('550e8400-e29b-41d4-a716-446655440000', 'John Doe', 85);
