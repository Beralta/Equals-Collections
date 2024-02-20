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

public int hashCode() {
        return code == null ? 0 : this.code.hashCode();
    }

    //hashCode: É utilizado para buscar um código único de hash do objeto onde determina o local aonde o mesmo está armazenado

    // Se x.equals(y) == y.equals(x), logo x.hashCode() == y.hashCode() (Sem colisão)
    // Se y.hashCode() == x.hashCode() não cenessariamente y.equals(x) == true (Com colisão)
