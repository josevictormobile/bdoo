package teste;

import java.util.List;

import dao.r.MunicipioDao;
import entidade.Municipio;
import entidade.Uf;

public class MunicipioTeste {

	public static void main(String[] args) {
		Municipio municipio = new Municipio();
		MunicipioDao municipioDao = new MunicipioDao();
		Uf uf = new Uf();

		// municipio.setId(1);
		// municipio.setNome("Juazeiro do Norte");
		// uf.setId(1);
		// municipio.setUf(uf);
		// municipioDao.criar(municipio);

		// municipio.setId(2);
		// municipio.setNome("João Pessoa");
		// uf.setId(2);
		// uf.setSigla("PB");
		// uf.setNome("Paraíba");
		// municipio.setUf(uf);
		// municipioDao.criar(municipio);

		// municipio.setId(1);
		// Municipio municipioLer = municipioDao.ler(municipio);
		// if (municipioLer == null) {
		// System.out.println("Não localizado registro com os dados
		// informados");
		// } else {
		// System.out.println("ID: " + municipioLer.getId());
		// System.out.println("Cidade: " + municipioLer.getNome() + " - " +
		// municipioLer.getUf().getSigla());
		// }

		List<Municipio> municipios = municipioDao.lerTudo();
		if (municipios.size() == 0) {
			System.out.println("Tabela vazia");
		} else {
			for (Municipio mmunicipioResult : municipios) {
				System.out.println("ID: " + mmunicipioResult.getId());
				System.out
						.println("Cidade: " + mmunicipioResult.getNome() + " - " + mmunicipioResult.getUf().getSigla());
			}
		}

		System.out.println("*************************");

		// municipio.setId(1);
		// municipio.setNome("Juazeiro");
		// uf.setId(3);
		// uf.setSigla("PE");
		// uf.setNome("Pernambuco");
		// municipio.setUf(uf);
		// municipioDao.atualizar(municipio);

		municipio.setId(2);
		municipioDao.excluir(municipio);

		System.out.println("*************************");

		municipios = municipioDao.lerTudo();
		if (municipios.size() == 0) {
			System.out.println("Tabela vazia");
		} else {
			for (Municipio mmunicipioResult : municipios) {
				System.out.println("ID: " + mmunicipioResult.getId());
				System.out
						.println("Cidade: " + mmunicipioResult.getNome() + " - " + mmunicipioResult.getUf().getSigla());
			}
		}

		System.out.println("Rotina concluída!");

	}

}
