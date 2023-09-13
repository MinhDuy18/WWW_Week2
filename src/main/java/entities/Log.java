package entities;

import java.sql.Date;
import java.time.LocalDateTime;

public class Log {
    private int id;
    private Account account;
    private LocalDateTime login_time;
    private LocalDateTime logout_time;
    private String notes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public LocalDateTime getLogin_time() {
        return login_time;
    }

    public void setLogin_time(LocalDateTime login_time) {
        this.login_time = login_time;
    }

    public LocalDateTime getLogout_time() {
        return logout_time;
    }

    public void setLogout_time(LocalDateTime logout_time) {
        this.logout_time = logout_time;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Log(int id, Account account, LocalDateTime login_time, LocalDateTime logout_time, String notes) {
        this.id = id;
        this.account = account;
        this.login_time = login_time;
        this.logout_time = logout_time;
        this.notes = notes;
    }

    public Log() {
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", account=" + account +
                ", login_time=" + login_time +
                ", logout_time=" + logout_time +
                ", notes='" + notes + '\'' +
                '}';
    }
}
