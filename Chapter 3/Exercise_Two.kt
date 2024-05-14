import java.util.Scanner


fun main(args: Array<String>) {
    if (args.size < 1)
    {
        println("Usage: java Main <query>")
        return
    }

    val query = args[0]
    val scanner = Scanner(System.`in`)

    while (scanner.hasNextLine())
    {
        val line = scanner.nextLine()
        if (line.contains(query))
        {
            println(line)
        }
    }

        scanner.close()
    }
