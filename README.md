# Questão 1 - Sistema de Relatórios Operacionais

## Descrição
Uma empresa de logística está desenvolvendo um sistema para criar diferentes tipos de relatórios operacionais (relatório diário, relatório semanal, relatório emergencial). Cada tipo de relatório possui regras específicas de preparação, como fontes de dados distintas, priorização de métricas e formatos diferentes. O time deseja projetar o sistema de forma que a criação dos relatórios possa ser estendida com novos tipos no futuro, sem alterar o núcleo do sistema. Implemente uma solução em Java que permita ao sistema delegar a criação dos relatórios a uma estrutura flexível, extensível e isolada por tipo de relatório. Sua solução conter dois tipos de relatórios e deve permitir adicionar novos relatórios sem modificar os existentes.

## Justificativa do Padrão
Escolhi usar o padrão Factory, porque ele facilita a criação de objetos complexos e centraliza a lógica de instância. Além disso, reduz o acoplamento entre as classes e melhora a flexibilidade do código.

Dessa forma, a lógica de criação dos relatórios é centralizada, possibilitando para que sejam adicionados novos relatórios sem modificar os existentes.

# Questão 2 - Sistema Bancário

## Descrição
Uma plataforma de análise de investimentos precisa calcular o perfil de risco de clientes utilizando diferentes abordagens de cálculo (modelo agressivo, modelo moderado, modelo conservador). Cada abordagem utiliza fórmulas diferentes, pesos distintos e critérios próprios. O software deve permitir que o método de cálculo seja escolhido dinamicamente em tempo de execução, de acordo com o cliente ou conforme configurado por um consultor. Implemente uma solução em Java que permita alternar entre as diferentes lógicas de cálculo sem alterar o fluxo principal de análise, garantindo flexibilidade para adicionar novos modelos sem modificar os existentes.

## Justificativa do Padrão

Escolhi usar o padrão Strategy, porque permite trocar algoritmos ou comportamentos em tempo de execução. Além disso, isola as variações e evita o uso excessivo de condicionais.

Dessa forma, assim como pedido, é possível alterar entre as diferentes lógicas de cálculo sem alterar o fluxo principal da análise.
