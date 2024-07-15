package med.voll.api.domain.medico;

import med.voll.api.domain.model.Medico;

public record DadosListagemMedicoDTO(
        Long id,
        String nome,
        String telefone,
        String email,
        String crm,
        Especialidade especialidade
) {
    public DadosListagemMedicoDTO(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getTelefone(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}
