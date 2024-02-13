package dev.collections.com.Collections.dominio;

public class SmartPhone {

    private String code;
    private String myName;

    public SmartPhone(String code, String myName) {
        this.code = code;
        this.myName = myName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return  false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        SmartPhone smartPhone = (SmartPhone) obj;
        return code != null && code.equals(smartPhone.code);
    }

    //Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    //Simétrico: para X e Y diferente de true, se x.equals(y) == true logo, y.equals(x) == true
    //Transitividade: para x,y,z, diferentes de null, se x.equals(y) == true, e x.equals(z) == true, y.equals(z) == true
    //Consistente: x.equals(x) sempre retorna true se x for != null

    // ( Vereficar se o objeto é null, casjo seja vai retornar falso )
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
