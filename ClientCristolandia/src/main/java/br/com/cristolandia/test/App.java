package br.com.cristolandia.test;

import javax.swing.JOptionPane;

import br.com.cristolandia.entity.Pessoa;
import br.com.cristolandia.service.ServiceClient;

/**
 * teste client
 *
 */
public class App {
    
	public static void main( String[] args ) {
    	
    	String opcao = JOptionPane.showInputDialog(null,
				"Escolha uma opção: \n" + " 1-CADASTRAR ",
				"OPÇÕES", JOptionPane.PLAIN_MESSAGE);
 
		// SAI DO PROGRAMA SE NÃO INFORMAR NENHUMA OPÇÃO
		if (opcao == null)
			System.exit(0);
 
		switch (Integer.parseInt(opcao)) {
		case 1:
			Cadastrar();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
			main(null);
			break;
		}
 
	}
 
	public static void Cadastrar() {
 
		// DECLARANDO O OBJETO DA NOSSA CLASSE QUE ACESSA O SERVIÇO REST
		ServiceClient client = new ServiceClient();
 
		// CAPTURA AS INFORMAÇÕES PARA CADASTRO
		String nome = JOptionPane.showInputDialog(null, "Nome:", "Novo Cadastro", JOptionPane.PLAIN_MESSAGE);
		String sexo = JOptionPane.showInputDialog(null, "Sexo: (M ou F)", "Novo Cadastro", JOptionPane.PLAIN_MESSAGE);
 
		// SETA OS VALORES NO NOSSO JAVABEANS
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setSexo(sexo);
 
		// EFETUA O CADASTRO DE UMA NOVA PESSOA
		String resultado = client.CadastrarPessoa(pessoa);
 
		// MENSAGEM COM O RESULTADO
		JOptionPane.showMessageDialog(null, resultado);
 
		// CHAMANDO O MÉTODO PRINCIPAL PARA COMEÇAR A EXECUTAR AS OPÇÕES
		// NOVAMENTE
		main(null);
 
	}
    
}
