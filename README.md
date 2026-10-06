# Fantasy Hockey Command Center V4 — IceIQ

V4 is the major intelligence release.

## Highlights
- IceIQ projections from NHL game logs using the league's exact scoring weights.
- 55% season / 45% recent-five FP-per-game blend, with transparent confidence and 7-day schedule projection.
- Separate goalie scoring model.
- Ranked Best Move Right Now / move queue.
- Rebuilt six-step Settings and onboarding center.
- Player lab with headshots, upcoming schedule, recent modeled FP and projection explanation.
- Schedule-density and acquisition-budget intelligence.
- Read-only Pool Hub share links with Yahoo secrets excluded.
- Installable PWA and Android wrapper.
- GHCR + Unraid-ready release pipeline and Android APK GitHub Actions workflow.

## Current Yahoo status
Yahoo OAuth can remain connected while the application is awaiting Fantasy API provisioning. IceIQ works independently from public NHL data and falls back gracefully.

## Repository deployment (recommended)
The included workflows publish `ghcr.io/captain134/fantasy-hockey-command-center:latest` on pushes to `main`, plus version tags on `v*` releases. The included Unraid XML points at that image so Unraid can detect updates without rebuilding locally.

Never commit Yahoo credentials or `/config`.
