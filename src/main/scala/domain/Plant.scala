package domain

import java.util.UUID


case class Plant(id: PlantId, name: String, country: String)

case class PlantId(value: UUID) extends AnyVal

object PlantId {
  implicit def longToPlantId(value: UUID): PlantId = PlantId(value)
}
