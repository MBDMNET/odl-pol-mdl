#### Librería de validación de proyectos y versionado automático - Bitbucket Hooks

# Tabla de contenidos
1. [Reglas de aceptación](#reglas)
2. [Instalación](#instalacion)
    * [Instalación Global](#instalacionglob)
    * [Instalación Específica](#instalacionesp)
3. [Uso de la herramienta](#uso)
4. [Exclusiones](#exclusiones)
5. [Soporte](#soporte)

---

Este proyecto recoge todas las utilidades de autoversionado (incremento de versión automática) y validación de las versiones de todos los proyectos, incluyendo los proyectos desarrollados con la la tecnología Spring-Maven y los basados en Angular-NPM.

El proyecto está formado por dos utilidades:

* **Validación**: Se validará que todas las versiones subidas a los repositorios Git sigan los estándares establecidos.
* **Autoversionado**: Se ofrecerá una herramienta para aplicar estos incrementos de versión al proyecto de manera automática antes de realizar una subida al repositorio, asegurando así que esta subida será aceptada en la fase de **validación**.
<br/><br/><br/>

<a name="reglas"></a>

## Reglas de aceptación


La fase de validación del proyecto se ejecutará en el momento en el que el servidor reciba una petición de _push_ a un repositorio y el servidor decidirá en ese momento si el proyecto es válido o si por el contrario deberá rechazar la petición.

Para desarrollar esta funcionalidad, se ha creado e instalado en el servidor un plugin de Bitbucket. Este plugin contiene un Git Hook de validación que se accionará cuando el servidor reciba una petición de _push_.

Los requerimientos para que un push sea considerado válido serán los siguientes:

- Proyectos basados en Spring-Maven:
    - La versión del proyecto presente en el POM.xml deberá seguir el estándar Semver (X.Y.Z) y deberán incluir una etiqueta de tipo de versión (-SNAPSHOT o -RELEASE).
    - En caso de tratarse de un proyecto multimódulo, cada uno de los módulos hijos deberán tener la misma versión que el padre, siguiendo por lo tanto el estándar Semver.
    - La versión incluida deberá ser superior con respecto a la presente en la rama sobre la que se está haciendo la subida. De esta manera se asegurará que la generación de versiones es incremental.
<br/><br/>
- Proyectos basados en Angular-NPM
    - La versión del proyecto presente en el package.json deberá seguir el estándar Semver (X.Y.Z) y deberán incluir una etiqueta de tipo de versión (-SNAPSHOT o -RELEASE).
    - La versión incluida deberá ser superior con respecto a la presente en la rama sobre la que se está haciendo la subida. De esta manera se asegurará que la generación de versiones es incremental.
    
<a name="instalacion"></a>
 
## Instalación


Se ofrece una herramienta de autoversionado basada en Client Git Hooks que permitirá la gestión automática de los incrementos de versión del proyecto antes de pedir un push al repositorio. 

Hay dos métodos de instalación de la herramienta posibles:
- Instalación global de la herramienta de autoversionado. Esto hará que todos los repositorios con los que trabajemos en el equipo tengan aplicada la herramienta de autoversionado. **Esta modalidad de instalación es la recomendada.**
- Instalación específica de la herramienta de autoversionado en el repositorio con el que estamos trabajando actualemente. Esto hará que si cambiamos a otro repositorio del equipo no tendremos disponible la herramienta de autoversionado hasta que no la instalemos en dicho repositorio. 
    
A continuación se documenta la instalación dependiendo de la modalidad seleccionada:

<a name="instalacionglob"></a>

##### Instalación global (RECOMENDADA)

Para instalar la herramienta de autoversionado de manera global en nuestro equipo deberemos abrir Git Bash y ejecutar los siguientes comandos:

1. "`cd ~`" - Para movernos a la carpeta global del usuario.
2. "`mkdir .githooks`" - Para crear la carpeta donde meteremos los scripts de la herramienta
3. "`cd .githooks/`" - Nos movemos dentro de la carpeta recién creada
4. "`USERNAME={usuario}`" - Guardaremos en una variable nuestro usuario de acceso a Git. Se deberá sustituir {usuario} por nuestro usuario de acceso a Git antes de ejecutar el comando. **NOTA**: Si nuestro usuario contiene algún carácter especial como "&", este deberá escaparse. De esta manera, si nuestro usuario es "abdc$20", el comando a ejecutar será: "`USERNAME:abcd\&20`"
5. "`PASSWORD={contraseña}`" - Guardaremos en una variable nuestra contraseña de acceso a Git. Se deberá sustituir {contraseña} por nuestra constraseña de acceso a Git antes de ejecutar el comando. **NOTA**: Si nuestra contraseña contiene algún carácter especial como "&", este deberá escaparse. De esta manera, si nuestra contraseña es "abdc$20", el comando a ejecutar será: "`PASSWORD:abcd\&20`"
6. "`curl -k --user $USERNAME:$PASSWORD "https://git.santalucia.net/projects/ARQ/repos/bitbucket-client-side-hooks/browse/commit-msg?at=master&raw" -o commit-msg`" - Descargamos a la carpeta actual el script de autoversionado.
7. "`curl -k --user $USERNAME:$PASSWORD "https://git.santalucia.net/projects/ARQ/repos/bitbucket-client-side-hooks/browse/post-commit?at=master&raw" -o post-commit`" - Descargamos a la carpeta actual el segundo script de autoversionado.
8. "`curl -k --user $USERNAME:$PASSWORD "https://git.santalucia.net/projects/ARQ/repos/bitbucket-client-side-hooks/browse/stl-exclusions.sh?at=master&raw" -o stl-exclusions.sh`" - Descargamos a la carpeta actual el fichero de excepciones.
9. "`git config --global core.hooksPath ~/.githooks`" - Configuramos de manera global los repositorios Git para utilizar los scripts que acabamos de descargar.


<a name="instalacionesp"></a>

##### Instalación específica

Para instalar la herramienta de autoversionado de manera específica para un repositorio en concreto con el que estemos trabajado deberemos abrir Git Bash y ejecutar los siguientes comandos:

1. Deberemos movernos a la carpeta actual de trabajo, utilizando el comando `cd` hasta la carpeta en la que estemos trabajando.
2. "`mkdir bitbucket-hooks`" - Para crear la carpeta donde meteremos los scripts de la herramienta
3. "`cd bitbucket-hooks`" - Nos movemos dentro de la carpeta recién creada
4. "`USERNAME={usuario}`" - Guardaremos en una variable nuestro usuario de acceso a Git. Se deberá sustituir {usuario} por nuestro usuario de acceso a Git antes de ejecutar el comando. **NOTA**: Si nuestro usuario contiene algún carácter especial como "&", este deberá escaparse. De esta manera, si nuestro usuario es "abdc$20", el comando a ejecutar será: "`USERNAME:abcd\&20`"
5. "`PASSWORD={contraseña}`" - Guardaremos en una variable nuestra contraseña de acceso a Git. Se deberá sustituir {contraseña} por nuestra constraseña de acceso a Git antes de ejecutar el comando. **NOTA**: Si nuestra contraseña contiene algún carácter especial como "&", este deberá escaparse. De esta manera, si nuestra contraseña es "abdc$20", el comando a ejecutar será: "`PASSWORD:abcd\&20`"
6. "`curl -k --user $USERNAME:$PASSWORD "https://git.santalucia.net/projects/ARQ/repos/bitbucket-client-side-hooks/browse/commit-msg?at=master&raw" -o commit-msg`" - Descargamos a la carpeta actual el script de autoversionado.
7. "`curl -k --user $USERNAME:$PASSWORD "https://git.santalucia.net/projects/ARQ/repos/bitbucket-client-side-hooks/browse/post-commit?at=master&raw" -o post-commit`" - Descargamos a la carpeta actual el segundo script de autoversionado.
8. "`cd ..`" - Volvemos a la carpeta de trabajo del proyecto.
9. "`git config core.hooksPath ./bitbucket-hooks`" - Configuramos el repositorio Git con el que estamos trabajando para que utilice los scripts que acabamos de descargar.


<a name="uso"></a>

## Uso de la herramienta

El uso de la herramienta es realmente sencillo. Lo único que necesitaremos será indicar en el último commit que hagamos antes de ejecutar un push el tipo de cambio que vamos a subir al repositorio de la aplicación. La forma de indicar esto será haciendo un commit con el siguiente formato:

---

&lt;tipo> [opcional alcance]: &lt;descripción> 

[opcional cuerpo]

[opcional pie(s) de mensaje]


---

Para más información sobre el estándar de mensaje de commit, consultar [Conventional-Commits](https://www.conventionalcommits.org/).

Los cambios pueden ser de cinco tipos:

- **docs**: Cambio en la documentación del proyecto. Al no cambiarse ni añadirse ninguna funcionalidad de la aplicación, no se incrementará la versión. Mensaje de ejemplo: `docs: añadida documentación al código.`
- **feat**: Una nueva funcionalidad en la aplicación. Se aumentará el índice MINOR de la versión actual. Mensaje de ejemplo: `feat: Se ha añadido una funcionalidad a la aplicación. Ejemplo de versionado aplicado: 1.0.0-SNAPSHOT --> 1.1.0-SNAPSHOT`
- **fix**: La solución de alguna incidencia encontrada o el añadido de una nueva funcionalidad pequeña. Se aumentará el índice PATCH de la versión actual. Mensaje de ejemplo: `fix: Solución de la incidencia. Ejemplo de versionado aplicado: 1.0.0-SNAPSHOT --> 1.0.1-SNAPSHOT`
- **chore**: Cambios que no requieren de incremento de versión (.gitignore, comentarios, ...). Al no cambiarse ni añadirse ninguna funcionalidad de la aplicación, no se incrementará la versión. Mensaje de ejemplo: `chore: añadido .gitignore.  Ejemplo de versionado aplicado: Sin cambio de versión`
- **refactor**: Refactorización del código que no añade funcionalidad ni repara la funcionalidad presente. Al no cambiarse ni añadirse ninguna funcionalidad de la aplicación, no se incrementará la versión. Mensaje de ejemplo: `chore: añadido .gitignore. Ejemplo de versionado aplicado: Sin cambio de versión`

En caso de que un cambio de cualquiera de los tipos anteriores haga que la funcionalidad de la aplicación cambie tan drásticamente que rompa la compatibilidad con otras aplicaciones, será necesario indicarlo para incrementar el índice MAJOR de la versión. Para ello, se podrá:

- Introducir un símbolo de exclamación (!) antes de los dos puntos que separan el tipo de cambio y la descripción de este. Ejemplo: `feat!: Añadida funcionalidad que rompe la compatibilidad de la aplicación.`
- Indicarlo introduciendo las palabras "BREAKING CHANGE" en el pie del mensaje. Ejemplo:

`feat: Añadida funcionalidad que rompe la compatibilidad de la aplicación`
<br><br>
`Se ha creado una funcionalidad nueva. Esta funcionalidad rompe la compatibilidad de la aplicación.`
<br><br>
`BREAKING CHANGE`
<br><br>
`Ejemplo de versionado aplicado: 1.0.0-SNAPSHOT --> 2.0.0-SNAPSHOT`


Una vez incluido el commit con este formato, al ejecutar el push sobre el repositorio se ejecutará este git-hook, detectando la versión actual, calculando la nueva versión y aplicandola sobre el proyecto actual en caso de ser necesario.

## Exclusiones
<a name="exclusiones"></a>

Si por el motivo que fuese, no se deseara activar la herramienta en un push en concreto, se puede ejecutar el comando de push con la opción de `--no-verify`, lo que evitara que se ejecute el script de autoversionado.

Además de ello, se puede copiar el fichero `stl-exclusions.sh` en la carpeta `~/.githooks/` y rellenarlo con los proyectos que quieran excluirse del autoversionado. Por ejemplo, si queremos excluir los proyectos "proyecto1", "proyecto2" y "proyecto3", el contenido del fichero debería ser:


## Soporte
<a name="soporte"></a>

Si encuentras cualquier problema con la librería o tienes dudas sobre su uso, envía un correo a este [buzón](mailto:arquitectura.software@santalucia.es).

