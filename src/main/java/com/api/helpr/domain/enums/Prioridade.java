package com.api.helpr.domain.enums;

public enum Prioridade {
	  BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"), ALTA(2, "ALTA");

		 private Integer codigo;
		    private String descricao;

		    private Prioridade(Integer codigo, String descricao) {
		        this.codigo = codigo;
		        this.descricao = descricao;
		    }
		    public Integer getCodigo() {
		    	return codigo;
		    }
		    
		    public String getDescricao() {
		    	return descricao;
		    }

		    

		    public static Prioridade toEnum(Integer cod) {
		        if (cod == null) {
		            return null;
		        }
//		        Vai em perfil, cria um objeto x e acada loop x vai ser um valor do enum
				for (Prioridade x : Prioridade.values()) {
					if (cod.equals(x.getCodigo())) {
						return x;
					}
				}

				throw new IllegalArgumentException("Prioridade Inválida");
		    }

}