package br.com.tcs.treinamento.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    // Identificador da entidade
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nome da pessoa (obrigatório)
    @Column(nullable = false)
    private String nome;

    // Idade da pessoa
    private Integer idade;

    // E-mail (obrigatório)
    @Column(nullable = false)
    private String email;

    // Data de nascimento (utiliza somente a data, sem horário)
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(name = "nomeCachorro")
    private String nomeCachorro;

    @Temporal(TemporalType.DATE)
    private Date dataCachorro;

    // Indica se o documento é CPF ou CNPJ
    private String tipoDocumento;

    // Número do CPF (caso tipoDocumento seja CPF)
    private String numeroCPF;

    // Número do CNPJ (caso tipoDocumento seja CNPJ)
    private String numeroCNPJ;

    // Indica se o documento é SinPatinhas ou CertidãoPet
    private String tipoDocumentoPet;

    // Número do SinPatinhas (caso tipoDocumento seja SinPatinhas)
    private String numeroSinPatinhas;

    // Número da CertidaoPet (caso tipoDocumento seja CertidãoPet)
    private String numeroCertidaoPet;

    // Motivo da manutenção (alteração, exclusão ou desativação)
    private String motivoManutencao;

    // Data da última manutenção (grava data e hora)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataManutencao;

    // Flag para exclusão lógica (soft delete)
    private Boolean ativo = true;

    // Construtor padrão
    public Pessoa() {
    }

    // Construtor completo (opcional para facilitar a criação)
    public Pessoa(String nome, Integer idade, String email, Date data, String tipoDocumento,
                  String numeroCPF, String numeroCNPJ, String motivoManutencao, Date dataManutencao,
                  Boolean ativo, String nomeCachorro, Date dataCachorro, String tipoDocumentoPet, String numeroSinPatinhas, String numeroCertidaoPet) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.data = data;
        this.tipoDocumento = tipoDocumento;
        this.numeroCPF = numeroCPF;
        this.numeroCNPJ = numeroCNPJ;
        this.motivoManutencao = motivoManutencao;
        this.dataManutencao = dataManutencao;
        this.ativo = ativo;
        this.nomeCachorro = nomeCachorro;
        this.dataCachorro = dataCachorro;
        this.tipoDocumentoPet = tipoDocumentoPet;
        this.numeroSinPatinhas = numeroSinPatinhas;
        this.numeroCertidaoPet = numeroCertidaoPet;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    // equals e hashCode baseados no id (único identificador)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Método toString opcional para facilitar a depuração

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", data=" + data +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroCPF='" + numeroCPF + '\'' +
                ", numeroCNPJ='" + numeroCNPJ + '\'' +
                ", motivoManutencao='" + motivoManutencao + '\'' +
                ", dataManutencao=" + dataManutencao +
                ", ativo=" + ativo +
                '}';
    }
}