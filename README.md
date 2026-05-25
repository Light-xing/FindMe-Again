# FindMe Again

[English](#english) | [中文](#中文)

---

## 中文

FindMe Again 是一个 Minecraft Fabric 模组，悬停物品后按搜索键（默认 `Y`）即可高亮附近存放该物品的容器。

本版本是对原 [FindMe](https://www.curseforge.com/minecraft/mc-mods/findme) 模组的迁移，面向 Minecraft 26.1 Fabric。

### 与原版的主要变化

1. 迁移至 Minecraft 26.1 Fabric。
2. 移除 Architectury 依赖，不再支持 NeoForge。
3. 将粒子透视效果改为 GTNH 风格的线框穿墙透视。

### 功能

- 悬停物品按 `Y` 搜索附近容器中匹配的物品，并以线框高亮
- Shift + `Y` 搜索并将视角对准目标容器
- 小键盘 `0` / `1` 从远处容器拉取物品到背包

### 配置文件

| 配置项 | 作用 | 类型 | 默认值 |
| --- | --- | --- | --- |
| `CONTAINER_TRACKING` | 是否启用容器搜索 | 布尔值 | `true` |
| `CONTAINER_TRACK_TIME` | 容器高亮时间 | 整数（tick） | `600` |
| `SNAP_TO_CONTAINER` | 是否将视角对准容器 | 布尔值 | `true` |
| `CONTAINER_HIGHLIGHT_COLOR` | 物品栏中物品高亮颜色 | 十六进制颜色代码（字符串） | `"#cf9d15"` |
| `LASER_DURATION` | 高亮线框时长 | 整数（tick） | `100` |
| `LASER_THROUGH_WALLS` | 线框是否穿墙可见 | 布尔值 | `true` |
| `BLOCK_LASER_COLOR` | 方块线框颜色 | 十六进制颜色代码（字符串） | `"#FF2200"` |
| `ITEM_LASER_COLOR` | 掉落物线框颜色 | 十六进制颜色代码（字符串） | `"#AA44FF"` |
| `ENTITY_LASER_COLOR` | 实体线框颜色 | 十六进制颜色代码（字符串） | `"#FFD700"` |
| `LASER_WIDTH` | 线框宽度 | 浮点数 | `2.0f` |
| `RADIUS_RANGE` | 搜索半径 | 整数（方块） | `32` |
| `IGNORE_ITEM_DAMAGE` | 是否忽略物品耐久 | 布尔值 | `false` |
| `SEARCH_ITEM_ENTITIES` | 是否搜索掉落物 | 布尔值 | `true` |
| `SEARCH_ENTITY_INVENTORIES` | 是否搜索实体物品栏 | 布尔值 | `true` |

### 构建

```bash
./gradlew build
```

### 已知不兼容

- 与 MiniHUD 的 `FIX_VANILLA_DEBUG_RENDERER_THROUGH` 功能不兼容，启用该功能会导致线框无法穿墙渲染。

### 致谢

- 原作者：Buuz135
- 迁移与重构：Light_xing01, Fight_xing

---

## English

FindMe Again is a Minecraft Fabric mod that highlights nearby containers storing the item you hover over. Press the search key (default `Y`) to search.

This version is a migration of the original [FindMe](https://www.curseforge.com/minecraft/mc-mods/findme) mod, targeting Minecraft 26.1 Fabric.

### Key Changes from the Original

1. Migrated to Minecraft 26.1 Fabric.
2. Removed Architectury dependency. NeoForge is no longer supported.
3. Replaced particle-based highlighting with GTNH-style wireframe wall-hack rendering.

### Features

- Hover an item and press `Y` to find matching items in nearby containers, highlighted with wireframes
- Numpad `0` / `1` to pull items from distant containers into your inventory

### Config

| Configuration Option | Description | Type | Default Value |
| --- | --- | --- | --- |
| `CONTAINER_TRACKING` | Enables container searching | Boolean | `true` |
| `CONTAINER_TRACK_TIME` | Container highlight duration | Integer (ticks) | `600` |
| `SNAP_TO_CONTAINER` | Snaps camera view to the container | Boolean | `true` |
| `CONTAINER_HIGHLIGHT_COLOR` | Highlight color for items in the inventory | Hex Color Code (String) | `"#cf9d15"` |
| `LASER_DURATION` | Highlight wireframe duration | Integer (ticks) | `100` |
| `LASER_THROUGH_WALLS` | Whether wireframes are visible through walls | Boolean | `true` |
| `BLOCK_LASER_COLOR` | Block wireframe color | Hex Color Code (String) | `"#FF2200"` |
| `ITEM_LASER_COLOR` | Dropped item wireframe color | Hex Color Code (String) | `"#AA44FF"` |
| `ENTITY_LASER_COLOR` | Entity wireframe color | Hex Color Code (String) | `"#FFD700"` |
| `LASER_WIDTH` | Wireframe width | Float | `2.0f` |
| `RADIUS_RANGE` | Search radius | Integer (blocks) | `32` |
| `IGNORE_ITEM_DAMAGE` | Ignores item durability/damage | Boolean | `false` |
| `SEARCH_ITEM_ENTITIES` | Searches for dropped items | Boolean | `true` |
| `SEARCH_ENTITY_INVENTORIES` | Searches entity inventories | Boolean | `true` |

### Building

```bash
./gradlew build
```

### Known Issues

- Incompatible with MiniHUD when `FIX_VANILLA_DEBUG_RENDERER_THROUGH` enabled in MiniHUD, which will cause the wireframe cannot render through walls.

### Credits

- Original author: Buuz135
- Migration & rework: Light_xing01, Fight_xing
