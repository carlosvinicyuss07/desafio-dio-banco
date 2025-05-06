import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Banco implements IBanco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    @Override
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    @Override
    public void removerConta(Conta conta) {
        if (!contas.isEmpty()) {
            contas.remove(conta);
        } else {
            System.out.println("O banco não possui contas cadastradas");
        }
    }

    @Override
    public void listarClientes() {
        for (Conta conta : contas) {
            System.out.println(conta.getCliente().getNome());
        }
    }
}
