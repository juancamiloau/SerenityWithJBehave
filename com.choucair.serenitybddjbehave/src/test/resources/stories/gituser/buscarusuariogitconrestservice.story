
Narrative:
In order to Verificar si un usuario git existe consumiendo un servicio Rest
As a usuario
I want to usar serenity rest para encontrar un usuario git
					 
Scenario:  Verificar que un usuario git existe en la pagina
Given Tengo un usuario git existente en la plataforma
When Busco el usuario el servicio API
Then El servicio me responde el JSon del usuario
