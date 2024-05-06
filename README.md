Gruppo secondo banco composto da: Iryna Melmikava, Giulio Mazzitelli, Annalisa Lupo e Simona Lucchetti.

Il programma è un gestionale di un ipotetico autonoleggio eseguito dal gruppo come test nell'ambito del corso Java On Boarding di Accademia Informatica. 
Il programma si gestisce tramite console.
In assenza di un database, i dati vengono salvati su dei file .txt che vengono caricati all'inizio dell'esecuzione del programma e sovrascritti quando necessario.
I file sono salvati in un package chiamato "file".
Il file .jar si trova nella out/artifacts/AutonoleggioEsameJob_jar/AutonoleggioEsameJob.jar.

MENU DI LOGIN

La schermata iniziale richiede di registrarsi, di fare login o di uscire.
1. Registrazione
   Chiede di immettere da console nome, cognome, password e mail. 
   Dopodiché si viene rimandati al menu iniziale.     

2. Login
   Chiede di inserire le credenziali: mail e password.

   Un esempio di log di Manager è il seguente: 
   mail: maria@auto.com
   password: Maria.78

   Un esempio di log di Cliente è il seguente: 
   mail: "mario83@gmail.com"
   password: Mario.83

3. Esci
   Esce dal programma

Una volta autenticati, si viene rimandati ad un secondo menu in cui si possono selezionare le azioni possibili.
A seconda della tipologia di utente (cliente o manager), verrà visualizzato un menu differente.

CASISTICA LOGIN DA CLIENTE

Le opzioni del secondo menu:

1. Ricerca auto disponibili per costo orario
   Ricerca tutte le auto taggate come disponibili all'interno di un range di date restituendo quelle di costo inferiore a quello inserito da console

2. Ricerca auto disponibili per marca e modello
   Ricerca tutte le auto taggate come disponibili all'interno di un range di date restituendo quelle che corrispondono al modello e alla marca inserite da console

3. Consultazione della lista completa delle auto disponibili in un dato lasso di tempo
   Ricerca tutte le auto taggate come disponibili all'interno di un range di date

4. Noleggio auto
   Permette di selezionare e scegliere l'auto da noleggiare che sia disponibile nel range temporale selezionato da console.
   Quando un'auto viene noleggiata, essa risulterà automaticamente non più disponibile per le date selezionate.

5. Consultazione dei propri noleggi attivi
   Stampa a schermo tutti i dati relativi ai noleggi attualmente in carico al cliente

6. Annullamento noleggio 
   Permette di annullare un noleggio indicando da console il numero di fattura corrispondente	

7. Uscita
   Esce dal programma

CASASITCA LOGIN DA MANAGER

1. Aggiunta auto
   Permette di inserire nuove auto nel parco auto; richiede i dati dell'auto tramite console

2. Rimozione auto
   Permette di rimuovere un'auto dal parco auto inserendo la targa tramite console

3. Cambio stato disponibilità auto
   Permette di cambiare lo stato di disponibilità di un'auto inserendo la targa tramite console

4. Restituzione a schermo della lista clienti
   Stampa la lista dei clienti   

5. Restituzione a schermo della lista utenti (clienti+manager)
   Stampa la lista dei clienti e dei manager

6. Restituzione a schermo della lista completa del parco auto 
   Stampa la lista di tutte le auto disponibili e non disponibili

7. Ricerca auto disponibili per costo orario
   Ricerca tutte le auto taggate come disponibili all'interno di un range di date restituendo quelle di costo inferiore a quello inserito da console

8. Ricerca auto disponibili per marca e modello
   Ricerca tutte le auto taggate come disponibili all'interno di un range di date restituendo quelle che corrispondono al modello e alla marca inserite da console

9. Restituzione a schermo di tutte le auto disponibili in un dato lasso di tempo
   Ricerca tutte le auto taggate come disponibili all'interno di un range di date

10. Noleggio auto
    Permette di selezionare e scegliere l'auto da noleggiare che sia disponibile nel range temporale selezionato da console.
    Quando un'auto viene noleggiata, essa risulterà automaticamente non più disponibile per le date selezionate.
  
11. Resistuzione auto 
    Permette di registrare la restituzione di un'auto inserendo da console il numero di fattura, 
    l'operatore deve inserire la data e l'ora di effettiva rinconsegna e l'operazione calcola il costo effettivo
    e salva il file con la nuova data di consegna e il nuovo costo

12. Restituzione a schermo delle auto noleggiate in passato e prenotate per un periodo futuro
    Stampa a schermo la lista dello storico dei noleggi
   
13. Consultazione dei propri noleggi attivi
    Stampa a schermo tutti i dati relativi ai noleggi attualmente in carico al cliente

14. Annullamento noleggio
    Permette di annullare un noleggio indicando da console il numero di fattura corrispondente

15. Uscita
    Esce dal programma   
 


TOP SECRET:

L'autonoleggio è anche una base segreta per le Batmobili di Batman. 

   Il login di Batman è il seguente:
   mail: bruce@batcaverna.bat
   password: B-111111

Quando l'utente segreto Batman effettua login, all'oscuro anche della visibilità del manager, visualizza un menu speciale:

1. Aggiunta Batmobile
  Permette di inserire nuove Batmobili all'elenco, richiede i dati dell'auto tramite console

2. Rimozione Batmobile
  Permette di rimuovere una Batmobile dalla lista, inserendo la targa tramite console

3. Resituzione a schermo della lista delle Batmobili
  Stampa a schermo la lista di tutte le Batmobili

4. Uscita
  Esce dal programma

Per gestire il programma sono state create le seguenti classi:

1. Automobile 
2. AutoNoleggiabile (estende Automobile)
3. Batmobile (estende Automobile)
4. ConsoleManage in cui sono stati implementati i metodi peculiari di richiesta input utente e rispettiva verifica la validità
5. GestioneAutonoleggio in cui sono stati implementati la maggior parte dei metodi necessari alla gestione dell'autonoleggio
6. NoleggioStorico in cui sono stati implementati i metodi per gestire lo storico dei noleggi e le prenotazioni
7. Utente che presenta un attributo "ruolo", che permette la differenziazione fra Cliente, Manager e Batman 
8. Main da cui prende avvio il programma

Per la gestione dei ruoli e dei rispettivi menu ci si è avvalsi della "classe" speciale Enum.

Per effettuare operazioni necessarie al funzionamento del programma, sono state create delle hashmap relative a: 

-parco auto nel suo insieme
-prenotazioni passate e future
-auto noleggiabili
-elenco utenti nel suo insieme
-elenco delle batmobili

Tra i metodi implementati, si segnalano: 

-metodo per la criptazione delle password presenti nel sistema
-metodo per effettuale registrazione e metodo per effettuare login: nel metodo di registrazione, 
  verrà assegnato il ruolo di Manager se il dominio della mail sarà @auto.com
  mentre verrà assegnato il ruolo di Batman se la mail coinciderà con "bruce@batcaverna.bat".
-metodi per caricare e sovrascrivere i file di testo
-metodi per aggiungere e rimuovere auto (per Batman si parla di Batmobili)
-metodi per filtrare auto disponibili per periodo e costo orario o per marca&modello
-metodi per la richiesta e il confronto delle date
-metodo per il calcolo del costo del noleggio


