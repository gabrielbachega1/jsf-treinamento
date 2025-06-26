package br.com.tcs.treinamento.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@ManagedBean(name="tabelaImagens")
@ViewScoped
public class TabelaImagens {
    private List<Integer> rows;
    private List<Integer> columns;

    @PostConstruct
    public void init() {
        rows = IntStream.rangeClosed(1, 3).boxed().collect(Collectors.toList());
        columns = IntStream.rangeClosed(1, 3).boxed().collect(Collectors.toList());
    }

    public List<Integer> getRows() { return rows; }
    public List<Integer> getColumns() { return columns; }
}
