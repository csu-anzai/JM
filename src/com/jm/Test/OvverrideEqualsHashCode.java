package com.jm.Test;

public class OvverrideEqualsHashCode {
    private final double id;
    private final double d;

    public OvverrideEqualsHashCode(double id, double d){
        this.id = id;
        this.d = d;
    }

    public static void main(String[] args){
        OvverrideEqualsHashCode a = new OvverrideEqualsHashCode(1, 1);
        OvverrideEqualsHashCode b = new OvverrideEqualsHashCode(1, 1);

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;

        if (obj == null) return false;

        if (this.getClass() != obj.getClass()) return false;

        OvverrideEqualsHashCode that = (OvverrideEqualsHashCode) obj;
        if (this.id != that.id) return false;
        if (this.d > that.d && this.d < that.d ) return false;

        return true;
    }

    @Override
    public int hashCode(){
        final int e = 31;
        double result = 1;
        result = result * e + id;
        result = result * e + d;
        return (int)result;
    }
}