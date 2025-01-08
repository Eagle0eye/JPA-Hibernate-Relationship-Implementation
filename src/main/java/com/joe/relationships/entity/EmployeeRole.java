package com.joe.relationships.entity;


public enum EmployeeRole {
    ADMIN, STAFF, SUPERVISOR;

    @Override
    public String toString() {
        switch (this)
        {
            case ADMIN -> {return "admin";}
            case STAFF -> {return "staff";}
            case SUPERVISOR -> {return "supervisor";}
            default -> {return "no role";}
        }
    }
}
