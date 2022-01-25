package net.skyfighttv.fastconsole.utils.file;

public enum Files {
    Config("config");

    private final String name;

    Files(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
