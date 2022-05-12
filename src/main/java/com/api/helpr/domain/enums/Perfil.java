package com.api.helpr.domain.enums;

public enum Perfil {
    ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");
// vai interagir com uma classe com metodos abstratos. remete a um metodo das regras que o admin vai ter.
	
    private Integer codigo;
    private String descricao;

    private Perfil(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
   
 public Integer getCodigo() {
    	return codigo;
    }
    
    public String getDescricao() {
    	return descricao;
    }

    

    public static Perfil toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
//        Vai em perfil, cria um objeto x e acada loop x vai ser um valor do enum
        for (Perfil x : Perfil.values()) {
            if (cod.equals(x.getCodigo())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Perfil Inválido");
    }

}