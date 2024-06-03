# WorkerContractsCalculator

WorkerContractsCalculator é um aplicativo Java desenvolvido para gerenciar e calcular o salário de um trabalhador com base em múltiplos contratos de trabalho por hora. Este projeto é parte de um conjunto de exercícios de programação em Java, focado no uso de classes, enumerações e operações de leitura de dados.

## Funcionalidades

- **Gerenciamento de Contratos:** Adicionar e remover contratos de trabalho para um trabalhador.
- **Cálculo de Salário:** Calcular o salário mensal de um trabalhador com base nos contratos vigentes.
- **Estrutura de Classes:** Uso de classes e enumerações para representar trabalhadores, contratos e níveis hierárquicos.

## Classes Principais

- **Worker:** Representa um trabalhador com nome, nível (JUNIOR, MID_LEVEL, SENIOR), salário base e uma lista de contratos de trabalho.
- **HourContract:** Representa um contrato de trabalho por hora, contendo data, valor por hora e total de horas trabalhadas.
- **Department:** Representa o departamento ao qual o trabalhador pertence.
- **WorkerLevel (enum):** Define os níveis hierárquicos de um trabalhador (JUNIOR, MID_LEVEL, SENIOR).

## Exemplo de Uso

### Entrada de Dados:

1. Leitura dos dados de um trabalhador (nome, nível, salário base, departamento).
2. Leitura de múltiplos contratos (data, valor por hora, horas trabalhadas).

### Cálculo de Salário:

1. Solicitar o mês e ano do usuário.
2. Exibir o salário do trabalhador para o mês e ano fornecidos.

## Tecnologias Utilizadas

- Java
