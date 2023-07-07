package ExerciciosSemana2.Exercicio4.Classes;

import ExerciciosSemana2.Exercicio4.Interface.Usuario;

public class UsuarioPremium implements Usuario {

    private String tipoUsuario = "Premium";

    @Override
    public Double getValorDesconto(double valorProduto) {
        double valorDesconto;
        if (valorProduto > 200) {
            valorDesconto = valorProduto * 0.30;
        }else{
            return null;
        }
        return valorDesconto;
    }

    @Override
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    @Override
    public Double getValorFreteDesconto(double frete, double valorProduto) {
        double descontoFrete;
        if (valorProduto > 100) {
            descontoFrete = frete;
        } else {
            return null;
        }
        return descontoFrete;
    }
}

