package entrega2_factory_method_2_1;

import java.util.List;

public class ArmazemNomesVirgulados extends ArmazemNomes {

	public ArmazemNomesVirgulados(List<Nome> nomes) {
		super(nomes);
	}

	@Override
	protected CriadorDeNomes getCriador() {
		return new CriadorDeNomesVirgulados();
	}

}
