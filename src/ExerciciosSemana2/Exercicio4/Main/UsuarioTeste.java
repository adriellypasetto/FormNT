package ExerciciosSemana2.Exercicio4.Main;

import ExerciciosSemana2.Exercicio4.Classes.UsuarioBase;
import ExerciciosSemana2.Exercicio4.Classes.UsuarioPremium;
import ExerciciosSemana2.Exercicio4.Classes.UsuarioStandard;
import ExerciciosSemana2.Exercicio4.Interface.Usuario;

public class UsuarioTeste {
    public static void main(String[] args) {
        double valorProduto = 600;
        double frete = 50;

        Usuario usuarioBase = new UsuarioBase();
        System.out.println("Usuario: " +usuarioBase.getTipoUsuario());
        System.out.println("Valor do desconto do produto R$ " + usuarioBase.getValorDesconto(valorProduto)) ;
        System.out.println("Valor do desconto no frete R$ " + usuarioBase.getValorFreteDesconto(frete,valorProduto)) ;

        System.out.println("");

        Usuario usuarioStandard = new UsuarioStandard();
        System.out.println("Usuario: " +usuarioStandard.getTipoUsuario());
        System.out.println("Valor do desconto do produto R$ " + usuarioStandard.getValorDesconto(valorProduto)) ;
        System.out.println("Valor do desconto no frete R$ " + usuarioStandard.getValorFreteDesconto(frete,valorProduto)) ;

        System.out.println("");

        Usuario usuarioPremium = new UsuarioPremium();
        System.out.println("Usuario: " +usuarioPremium.getTipoUsuario());
        System.out.println("Valor do desconto do produto R$ " + usuarioPremium.getValorDesconto(valorProduto)) ;
        System.out.println("Valor do desconto no frete R$ " + usuarioPremium.getValorFreteDesconto(frete,valorProduto)) ;



    }


}
