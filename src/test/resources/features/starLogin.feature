

Feature: I want login BancofalabellaEmpresas
  Background:
    Given I want enter to Bancofalabella Empresas



  @Loginsuccesfull
  Scenario Outline: Login succesful Bancofalabella Empresas

    When I log in with correct credentials
      | NameUser   | ClienteEmpresarial   | TipoDeIdentificación   | NúmeroDeIdentificación   | ClavePersonal   | ClaveToken   |
      | <NameUser> | <ClienteEmpresarial> | <TipoDeIdentificación> | <NúmeroDeIdentificación> | <ClavePersonal> | <ClaveToken> |
    Then See my name in the home page
    Examples:
      | NameUser                 | ClienteEmpresarial | TipoDeIdentificación | NúmeroDeIdentificación | ClavePersonal | ClaveToken |
      | Dayana Andrea Rojas Alba | 23534              | Cédula de Ciudadanía | 1049653008             | 976431        | 4500023170 |

