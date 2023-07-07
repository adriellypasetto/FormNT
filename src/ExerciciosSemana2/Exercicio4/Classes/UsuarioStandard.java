package ExerciciosSemana2.Exercicio4.Classes;

import ExerciciosSemana2.Exercicio4.Interface.Usuario;

public class UsuarioStandard implements Usuario {

    private String tipoUsuario = "Standard";

    @Override
    public Double getValorDesconto(double valorProduto) {
        double valorDesconto;
        if (valorProduto > 200) {
            valorDesconto = valorProduto * 0.15;
        } else {
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
        if (valorProduto > 200) {
            descontoFrete = frete * 0.10;
        } else {
            return null;
        }
        return descontoFrete;
    }
}
