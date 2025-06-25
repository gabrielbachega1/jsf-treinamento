package br.com.tcs.treinamento.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class PessoaVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private Integer idade;
    private String email;
    private Date data;
    private String tipoDocumento; // "CPF" ou "CNPJ"
    private String numeroCPF;
    private String numeroCNPJ;
    private String motivoManutencao;
    private Date dataManutencao;
    private Boolean ativo = true;
    private String nomeCachorro;
    private Date dataCachorro;
    private String tipoDocumentoPet;
    private String numeroSinPatinhas;
    private String numeroCertidaoPet;

    public PessoaVO(Long id,String nome, Integer idade, String email, Date data, String tipoDocumento, String numeroCNPJ,
                    String numeroCPF, Date dataManutencao, String motivoManutencao, Boolean ativo, String nomeCachorro,
                    Date dataCachorro, String tipoDocumentoPet, String numeroSinPatinhas, String numeroCertidaoPet) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.data = data;
        this.tipoDocumento = tipoDocumento;
        this.numeroCNPJ = numeroCNPJ;
        this.numeroCPF = numeroCPF;
        this.dataManutencao = dataManutencao;
        this.motivoManutencao = motivoManutencao;
        this.ativo = ativo;
        this.nomeCachorro = nomeCachorro;
        this.dataCachorro = dataCachorro;
        this.tipoDocumentoPet = tipoDocumentoPet;
        this.numeroSinPatinhas = numeroSinPatinhas;
        this.numeroCertidaoPet = numeroCertidaoPet;
    }

    public PessoaVO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getNumeroCNPJ() {
        return numeroCNPJ;
    }

    public void setNumeroCNPJ(String numeroCNPJ) {
        this.numeroCNPJ = numeroCNPJ;
    }

    public String getTipoDocumentoPet() {
        return tipoDocumentoPet;
    }

    public void setTipoDocumentoPet(String tipoDocumentoPet) {
        this.tipoDocumentoPet = tipoDocumentoPet;
    }

    public String getNumeroSinPatinhas() {
        return numeroSinPatinhas;
    }

    public void setNumeroSinPatinhas(String numeroSinPatinhas) {
        this.numeroSinPatinhas = numeroSinPatinhas;
    }

    public String getNumeroCertidaoPet() {
        return numeroCertidaoPet;
    }

    public void setNumeroCertidaoPet(String numeroCertidaoPet) {
        this.numeroCertidaoPet = numeroCertidaoPet;
    }

    public String getMotivoManutencao() {
        return motivoManutencao;
    }

    public void setMotivoManutencao(String motivoManutencao) {
        this.motivoManutencao = motivoManutencao;
    }

    public Date getDataManutencao() {
        return dataManutencao;
    }

    public void setDataManutencao(Date dataManutencao) {
        this.dataManutencao = dataManutencao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCachorro() {
        return nomeCachorro;
    }

    public void setNomeCachorro(String nomeCachorro) {
        this.nomeCachorro = nomeCachorro;
    }

    public Date getDataCachorro() {
        return dataCachorro;
    }

    public void setDataCachorro(Date dataCachorro) {
        this.dataCachorro = dataCachorro;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PessoaVO pessoaVO = (PessoaVO) o;
        return Objects.equals(id, pessoaVO.id) && Objects.equals(nome, pessoaVO.nome) && Objects.equals(idade, pessoaVO.idade) && Objects.equals(email, pessoaVO.email) && Objects.equals(data, pessoaVO.data) && Objects.equals(tipoDocumento, pessoaVO.tipoDocumento) && Objects.equals(numeroCPF, pessoaVO.numeroCPF) && Objects.equals(numeroCNPJ, pessoaVO.numeroCNPJ) && Objects.equals(motivoManutencao, pessoaVO.motivoManutencao) && Objects.equals(dataManutencao, pessoaVO.dataManutencao) && Objects.equals(ativo, pessoaVO.ativo) && Objects.equals(nomeCachorro, pessoaVO.nomeCachorro) && Objects.equals(dataCachorro, pessoaVO.dataCachorro) && Objects.equals(tipoDocumentoPet, pessoaVO.tipoDocumentoPet) && Objects.equals(numeroSinPatinhas, pessoaVO.numeroSinPatinhas) && Objects.equals(numeroCertidaoPet, pessoaVO.numeroCertidaoPet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, idade, email, data, tipoDocumento, numeroCPF, numeroCNPJ, motivoManutencao, dataManutencao, ativo, nomeCachorro, dataCachorro, tipoDocumentoPet, numeroSinPatinhas, numeroCertidaoPet);
    }
}
