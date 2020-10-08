package com.kodilla.collections.immutable.homework;

public final class Task {
    protected final String title;
    protected final int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getDuration() {
        return this.duration;
    }
}
