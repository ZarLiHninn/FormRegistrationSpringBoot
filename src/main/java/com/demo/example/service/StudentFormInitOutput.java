package com.demo.example.service;

import java.util.Set;

public class StudentFormInitOutput {

    private Set<Integer> birthDays;

    private Set<Integer> birthMonths;

    private Set<Integer> birthYears;

    private Set<String>  subjects;

    private Set<String> grades;

    public StudentFormInitOutput() {

    };

    public static class Builder {

        private Set<Integer> birthDays;

        private Set<Integer> birthMonths;

        private Set<Integer> birthYears;

        private Set<String>  subjects;

        private Set<String>  grades;

        public Builder() {}

        public Builder birthDays(Set<Integer> birthDays) {
            this.birthDays = birthDays;
            return this;
        }

        public Builder birthMonths(Set<Integer> birthMonths) {
            this.birthMonths = birthMonths;
            return this;
        }

        public Builder birthYears(Set<Integer> birthYears) {
            this.birthYears = birthYears;
            return this;
        }

        public Builder subjects(Set<String> subjects) {
            this.subjects = subjects;
            return this;
        }

        public Builder grades(Set<String> grades) {
            this.grades = grades;
            return this;
        }

        public StudentFormInitOutput build() {
            return new StudentFormInitOutput(this);
        }
    }

    private StudentFormInitOutput(Builder builder) {

        this.birthDays   = builder.birthDays;

        this.birthMonths = builder.birthMonths;

        this.birthYears  = builder.birthYears;

        this.subjects    = builder.subjects;

        this.grades      = builder.grades;

    }

    public Set<Integer> getBirthDays() {
        return birthDays;
    }

    public void setBirthDays(Set<Integer> birthDays) {
        this.birthDays = birthDays;
    }

    public Set<Integer> getBirthMonths() {
        return birthMonths;
    }

    public void setBirthMonths(Set<Integer> birthMonths) {
        this.birthMonths = birthMonths;
    }

    public Set<Integer> getBirthYears() {
        return birthYears;
    }

    public void setBirthYears(Set<Integer> birthYears) {
        this.birthYears = birthYears;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public Set<String> getGrades() {
        return grades;
    }

    public void setGrades(Set<String> grades) {
        this.grades = grades;
    }
}
