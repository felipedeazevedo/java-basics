package com.felipe.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Pessoa");
		//contato.setEndereco("Lugar feliz");
		//contato.setTelefone("00 1234-5678");
		
		Endereco end = new Endereco();
		
		end.setNomeRua("Rua teste");
		end.setNumero("01");
		end.setComplemento("Casa 01");
		end.setCidade("Cidade teste");
		end.setEstado("Estado teste");
		end.setCep("00000000");
		
		contato.setEndereco(end);
		
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("00");
		telefone.setNumero("12345-6789");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("00");
		telefone2.setNumero("0000-0000");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : telefones) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}    

}
