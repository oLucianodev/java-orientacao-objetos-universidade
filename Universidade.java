package br.com.universipi.main;
import br.com.universipi.core.QuestaoComDica;
import br.com.universipi.core.QuestaoMultiplaEscolha;
import br.com.universipi.core.Questao;
import java.util.Scanner;
public class Universidade {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int pontos=0;
		String minhaResp;
		Questao questoes [] = new Questao[5];
		questoes [0] = new QuestaoComDica ("quanto vale 1+1?","2","Resposta a expressao com dica");
		questoes [1] = new Questao ("quem descobriu o brasil?","pedro");
		questoes [2] = new QuestaoMultiplaEscolha ("qual a formula da agua?","b","ddd","h2o","hhjh","iii");
		questoes [3] = new QuestaoComDica ("qual a linguagem desse curso?","Java","começa com Ja e termina com java");
		questoes [4] = new Questao ("qual o professor?","Isidro");
		for (Questao q: questoes) {
			System.out.println(q.aplicarQuestao());
			System.out.println("Resposta:");
			minhaResp = teclado.nextLine();
			if(q.corrigir(minhaResp)) {
				System.out.println("acertou");
				pontos++;
			}
			else {
				System.out.println("errou");
			}
		}
		System.out.println("voce acertou "+ pontos + " de 5");
		
		
		
		
		
		
		teclado.close();
	}

}
