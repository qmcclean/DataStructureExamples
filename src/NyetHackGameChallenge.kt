fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 71
    var isBlessed = true
    val isImmortal = false
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()

    // Aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal, karma)

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    // Player status
    printPlayerStatus(auraColor, healthPoints, isBlessed, name, healthStatus)

    castFireball()

}

private fun printPlayerStatus(
    auraColor: String,
    healthPoints: Int,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) = println("(HP: $healthPoints) (Aura: $auraColor) (Blessed: $isBlessed) -> $name $healthStatus")


private fun auraColor(isBlessed: Boolean,
                      healthPoints: Int,
                      isImmortal: Boolean,
                      karma: Int) = if (isBlessed && healthPoints > 50 || isImmortal) when (karma) {
    in 0..5 -> "RED"
    in 6..10 -> "ORANGE"
    in 11..15 -> "PURPLE"
    in 16..20 -> "GREEN"
    else -> "NONE"
} else "NONE"

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but will heal quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt"
        else -> "is in awful condition"
    }


private fun castFireball(numFireballs: Int = 2) =
    println("A glass of Fireball springs into existence. (x$numFireballs)")
