package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voll.api.domain.endereco.DadosEndereco;
import med.voll.api.domain.medico.Especialidade.Especialidade;

public record DadosCadastroMedico(
        @NotNull
        @NotBlank
        String nome,

        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Formato do email é inválido")
        String email,

        @NotBlank(message = "CRM é obrigatório")
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull(message = "Especialidade é obrigatória")
        Especialidade especialidade,

        @NotNull(message = "Dados do endereço são obrigatórios")
        @Valid
        DadosEndereco endereco,

        @NotBlank(message = "Telefone é obrigatório")
        String telefone


) {

}
