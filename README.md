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

### Building

```bash
./gradlew build
```

### Known Issues

- Incompatible with MiniHUD when `FIX_VANILLA_DEBUG_RENDERER_THROUGH` enabled in MiniHUD, which will cause the wireframe cannot render through walls.

### Credits

- Original author: Buuz135
- Migration & rework: Light_xing01, Fight_xing
