package br.com.tcs.treinamento.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class TextoDigitado implements Serializable {
    private String textoDigitado;

    public void mostrarTexto() {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Você digitou:", textoDigitado);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public String getTextoDigitado() {
        return textoDigitado;
    }

    public void setTextoDigitado(String textoDigitado) {
        this.textoDigitado = textoDigitado;
    }
}