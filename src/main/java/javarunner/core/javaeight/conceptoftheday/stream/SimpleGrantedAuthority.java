package javarunner.core.javaeight.conceptoftheday.stream;

public final class SimpleGrantedAuthority implements GrantedAuthority{

    private final String role;

    public SimpleGrantedAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return this.role;
    }



}
