package teste;

import java.util.List;

import dao.r.UfDao;
import entidade.Uf;

public class UfTeste {

	public static void main(String[] args) {
		Uf uf = new Uf();
		UfDao ufDao = new UfDao();

		// uf.setId(1);
		// uf.setSigla("CE");
		// uf.setNome("Ceará");
		// ufDao.criar(uf);
		//
		// uf.setId(2);
		// uf.setSigla("PE");
		// uf.setNome("Pernambuco");
		// ufDao.criar(uf);

		uf.setId(1);
		Uf ufLer = ufDao.ler(uf);
		if (ufLer == null) {
			System.out.println("Não localizado registro com os dados informados");
		} else {
			System.out.println("ID: " + ufLer.getId());
			System.out.println("Sigla: " + ufLer.getSigla());
			System.out.println("Nome: " + ufLer.getNome());
		}

		List<Uf> ufs = ufDao.lerTudo();
		if (ufs.size() == 0) {
			System.out.println("Tabela vazia");
		} else {
			for (Uf ufResult : ufs) {
				System.out.println("ID: " + ufResult.getId());
				System.out.println("Sigla: " + ufResult.getSigla());
				System.out.println("Nome: " + ufResult.getNome());
			}
		}

		System.out.println("*************************");

		// uf.setId(2);
		// uf.setSigla("PB");
		// uf.setNome("Paraíba");
		// ufDao.atualizar(uf);

		// uf.setId(2);
		// ufDao.excluir(uf);

		System.out.println("*************************");

		ufs = ufDao.lerTudo();
		if (ufs.size() == 0) {
			System.out.println("Tabela vazia");
		} else {
			for (Uf ufResult : ufs) {
				System.out.println("ID: " + ufResult.getId());
				System.out.println("Sigla: " + ufResult.getSigla());
				System.out.println("Nome: " + ufResult.getNome());
			}
		}

		System.out.println("Rotina concluída!");

	}

}
