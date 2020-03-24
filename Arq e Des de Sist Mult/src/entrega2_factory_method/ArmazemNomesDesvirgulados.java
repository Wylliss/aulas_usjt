package entrega2_factory_method;

import java.util.List;

public class ArmazemNomesDesvirgulados extends ArmazemNomes {

	public ArmazemNomesDesvirgulados(List<Nome> nomes) {
		super(nomes);
	}

	@Override
	protected CriadorDeNomes getCriador() {
		return new CriadorDeNomesDesvirgulados();
	}

}
