package br.com.tcs.treinamento.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class TextoDigitado implements Serializable {
    private String textoDigitado;

    public String getTextoDigitado() {
        return textoDigitado;
    }

    public void setTextoDigitado(String textoDigitado) {
        this.textoDigitado = textoDigitado;
    }
}