[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/rYsm7pB4)

# Verificação Suplementar – Projeto de Software



# Questões

---
#### Questão 1 [1,0 ponto] Identifique os requisitos arquiteturais importantes para esse sistema e explique porque eles são relevantes

- USABILIDADE: O sistema deve ser fácil de usar e deve ser acessível a um grande público. 
- SEGURANÇA: O sistema deve ser capaz de proteger os dados coletados dos usuários de redes sociais, bem como os dados de agências de monitoramento e agências de emergência.
- CONFIABILIDADE: O sistema deve ser confiável e deve estar disponível 24 horas por dia, 7 dias por semana.
- PERFORMACE: O sistema deve ser capaz de responder rapidamente às consultas e solicitações dos usuários. 
- ESCALABILIDADE: O sistema deve ser capaz de escalar para lidar com um grande volume de dados e usuários.
- DESEMPENHO:O sistema deve ser capaz de processar grandes volumes de dados de redes sociais em tempo real.


---
#### Questão 2 [1,0 ponto] Projete o diagrama geral de arquitetura para esse sistema. Identifique os estilos arquiteturais utilizados em seu diagrama e justifique suas escolha

https://app.diagrams.net/#G1o6hOjQw7bvJH8EKSjn0eKQtz5lNs3lxL

https://drive.google.com/file/d/1o6hOjQw7bvJH8EKSjn0eKQtz5lNs3lxL/view?usp=sharing


ESTILO ARQUITETURAL DE MICROSERVIÇOS que é escalável, modular e permite o desenvolvimento independente de componentes específicos.


ORIENTADA A EVENTOS: Os componentes do sistema podem emitir eventos quando ocorre uma ação relevante (por exemplo, a detecção de um novo post sobre enchentes) e outros componentes podem reagir a esses eventos realizando ações apropriadas, por exemplo, enviar um alerta para uma agência. A arquitetura orientada a eventos é adequada para sistemas com interações complexas e assíncronas.


---
#### Questão 3 [2 pontos] Elabore os diagramas de sequência ou comunicação referentes as operações do caso de uso “Monitorar Enchente”. Utilize os padrões GRASP, indicando onde eles foram empregados e explicando porque foram empregados

https://app.diagrams.net/#G1Wud8Az2ktAIoGCkmdwfC_ONQQqeHAUbF

https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=VS-PdS-EM%20Q3.drawio#Uhttps%3A%2F%2Fdrive.google.com%2Fuc%3Fid%3D1Wud8Az2ktAIoGCkmdwfC_ONQQqeHAUbF%26export%3Ddownload


---
#### Questão 4 [2 pontos] Elabore o Diagrama de Classes do Projeto a partir do modelo conceitual e dos diagramas elaborados por você na Questão 2. Não se esqueça de incluir itens como: classes, associações, navegabilidade, dependências, multiplicidade, nome das associações, atributos (com tipos) e métodos (com tipo de parâmetros e retorno). Descreva como os princípios SOLID foram seguidos por você na sua solução.

https://app.diagrams.net/#G1YUbhW7jFShJgX8W-EO1DCjTePvDN3zi8


---
#### Questão 5 [2 pontos] Adote ao menos dois padrões GoF na sua solução, considerando os padrões mais relevantes para o cenário descrito. Descreva os padrões adotados, indicando no seu diagrama de classes



---
#### Questão 6 [2 pontos] Implemente o caso de uso “Monitorar Enchente”. Os acessos a sistemas externos não precisam ser implementados. Ao invés disso, utilize uma classe simulada com um método que retorna as informações necessárias. Essas informações podem ser estáticas. Certifique-se de que sua implementação segue os diagramas e princípios considerados nas questões anteriores.

