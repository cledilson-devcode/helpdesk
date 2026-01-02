package com.cledilsondevoffice.helpdesk.domain.enuns;

public enum Status {

    ABERTO(0,"ABERTO"),
    ANDAMENTO(1,"ANDAMENTO"),
    ENCERRRADO(2,"ENCERRRADO");

    private Integer codigo;
    private String descricao;

    Status(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Status toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }
        for (Status perfil : Status.values()) {
            if (perfil.getCodigo().equals(codigo)) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("Status inválido");
    }

}

