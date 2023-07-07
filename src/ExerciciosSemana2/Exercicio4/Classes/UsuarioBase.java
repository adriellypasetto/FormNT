package ExerciciosSemana2.Exercicio4.Classes;

import ExerciciosSemana2.Exercicio4.Interface.Usuario;

import java.util.Base64;

public class UsuarioBase implements Usuario {

    private String tipoUsuario = "Base";

    @Override
    public Double getValorDesconto(double valorProduto) {
        double valorDesconto;
        if (valorProduto > 300) {
            valorDesconto = valorProduto * 0.05;
        } else {
            return null;
        }
        return valorDesconto;
    };

    @Override
    public String getTipoUsuario() {
        return tipoUsuario;

    }

    @Override
    public Double getValorFreteDesconto(double frete, double valorProduto) {
        double descontoFrete;
        if (valorProduto > 300) {
            descontoFrete = frete * 0.05;
        } else {
            return null;
        }
        return descontoFrete;
    }
    }


