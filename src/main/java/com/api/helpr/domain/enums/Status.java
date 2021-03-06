package com.api.helpr.domain.enums;

public enum Status {
	    ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), CONCLUIDO(2, "CONCLUIDO");

	 private Integer codigo;
	    private String descricao;

	    private Status(Integer codigo, String descricao) {
	        this.codigo = codigo;
	        this.descricao = descricao;
	    }
	    public Integer getCodigo() {
	    	return codigo;
	    }
	    
	    public String getDescricao() {
	    	return descricao;
	    }

	    

	    public static Status toEnum(Integer cod) {
	        if (cod == null) {
	            return null;
	        }
//	        Vai em perfil, cria um objeto x e acada loop x vai ser um valor do enum
	        for (Status x : Status.values()) {
	            if (cod.equals(x.getCodigo())) {
	                return x;
	            }
	        }

	        throw new IllegalArgumentException("Status Inválido");
	    }
}
